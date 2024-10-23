package com.example.showcase.service;

import com.example.showcase.entity.Track;

import java.util.List;

public interface TrackService {
    Track createTrack(Track Track);

    Track getTrackById(int TrackId);

    List<Track> getAllTracks();

    Track updateTrack(int TrackId, Track updateTrack);

    void deleteTrack(int TrackId);
}
