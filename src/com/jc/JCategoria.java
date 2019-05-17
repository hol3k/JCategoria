package com.jc;

public class JCategoria {

    private static final JCReader jcReaderInstance = new JCReader();
    private static final JCWriter jcWriterInstance = new JCWriter();
    private static final JCCreator jcCreatorInstance = new JCCreator();

    public static JCReader getJcReaderInstance() {
        return jcReaderInstance;
    }

    public static JCWriter getJcWriterInstance() {
        return jcWriterInstance;
    }

    public static JCCreator getJcCreatorInstance() {
        return jcCreatorInstance;
    }
}
