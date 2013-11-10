package ru.regenix.jphp.runtime.env;

import java.io.File;

public class TraceInfo {
    private Context context;

    private int startLine;
    private int endLine;

    private int startPosition;
    private int endPosition;

    private String fileName;

    public TraceInfo(String fileName, int startLine, int startPosition) {
        this.fileName = fileName;
        this.startPosition = startPosition;
        this.startLine = startLine;
    }

    public TraceInfo(Context context, int startLine, int endLine, int startPosition, int endPosition) {
        this.fileName = context.getFile() == null ? null : context.getFile().getPath();
        this.context = context;
        this.startLine = startLine;
        this.endLine = endLine;
        this.startPosition = startPosition;
        this.endPosition = endPosition;
    }

    public TraceInfo(Context context){
        this(context, 0, 0, 0, 0);
    }

    public static TraceInfo valueOf(String fileName, int startLine, int startPosition){
        return new TraceInfo(fileName, startLine, startPosition);
    }

    public static TraceInfo valueOf(String fileName, long startLine, long startPosition){
        return new TraceInfo(fileName, (int) startLine, (int) startPosition);
    }

    public Context getContext() {
        if (context == null){
            context = new Context(null, new File(fileName));
        }
        return context;
    }

    public String getFileName(){
        return fileName;
    }

    public File getFile(){
        return fileName == null ? null : new File(fileName);
    }

    public int getStartLine() {
        return startLine;
    }

    public int getEndLine() {
        return endLine;
    }

    public int getStartPosition() {
        return startPosition;
    }

    public int getEndPosition() {
        return endPosition;
    }
}
