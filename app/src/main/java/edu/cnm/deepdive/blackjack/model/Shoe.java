package edu.cnm.deepdive.blackjack.model;

import androidx.annotation.NonNull;
import androidx.room.ColumnInfo;
import androidx.room.Entity;

import androidx.room.PrimaryKey;
import java.util.Date;

@Entity
public class Shoe {

  @PrimaryKey(autoGenerate = true)
  @ColumnInfo(name = "shoe_id")
  private long id;

  @ColumnInfo(index = true)
  @NonNull
  private Date created = new Date();

  private long marker;

  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }

  @NonNull
  public Date getCreated() {
    return created;
  }

  public void setCreated(@NonNull Date created) {
    this.created = created;
  }

  public long getMarker() {
    return marker;
  }

  public void setMarker(long marker) {
    this.marker = marker;
  }

}
