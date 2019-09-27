package com.design.pattern.adapter;

public class Mp4Player implements AdvancedMediaPlayer{

   @Override
   public void playMp4(String fileName) {
      System.out.println("Mp4Player Playing mp4 file. Name: "+ fileName);
   }

   @Override
   public void playVlc(String fileName) {
      //什么也不做
   }
}