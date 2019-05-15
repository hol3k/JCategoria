package com.jc;

public class JCategoria {

    private static final JCReader jcReaderInstance = new JCReader();
    private static final JCWriter jcWriterInstance = new JCWriter();

    public static JCReader getJcReaderInstance() {
        return jcReaderInstance;
    }

    public static JCWriter getJcWriterInstance() {
        return jcWriterInstance;
    }
}
