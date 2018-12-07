package structural.facade;

import java.io.File;

public class VideoConversionFacade {
    public File convertVideo(String fileName, String format) {
        System.out.println("VideoConversionFacade: conversion started.");

        VideoFile file = new VideoFile(fileName);
        Codec sourceCodec = CodecFactory.extract(file);
        Codec destinationCodec = getCodecByVideoType(format);

        VideoFile buffer = BitrateReader.read(file, sourceCodec);
        VideoFile intermediateResult = BitrateReader.convert(buffer, destinationCodec);
        File result = AudioMixer.fix(intermediateResult);

        System.out.println("VideoConversionFacade: conversion completed.");
        return result;
    }

    private Codec getCodecByVideoType(String format) {
        if (format.equals("mp4")) {
            return new OggCompressionCodec();
        } else {
            return new MPEG4CompressionCodec();
        }
    }
}
