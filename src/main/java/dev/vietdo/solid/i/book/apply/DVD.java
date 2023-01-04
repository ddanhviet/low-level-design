package dev.vietdo.solid.i.book.apply;

public interface DVD {

  int getRuntimeInInSeconds();

  // 4k, HD
  String getResolution();

  // loseless, 128kbps, 320kbps
  String getAudioBitRate();
}
