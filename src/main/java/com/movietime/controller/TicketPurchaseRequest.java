package com.movietime.controller;

public class TicketPurchaseRequest {

	
	  private int userId;
      private int movieId;
      private String showTime;

      public int getUserId() {
          return userId;
      }

      public void setUserId(int userId) {
          this.userId = userId;
      }

      public int getMovieId() {
          return movieId;
      }

      public void setMovieId(int movieId) {
          this.movieId = movieId;
      }

      public String getShowTime() {
          return showTime;
      }

      public void setShowTime(String showTime) {
          this.showTime = showTime;
      }
  }

