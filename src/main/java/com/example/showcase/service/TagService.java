package com.example.showcase.service;

import com.example.showcase.entity.Tag;
import com.example.showcase.entity.Track;

import java.util.Iterator;
import java.util.List;

public interface TagService {
    Tag createTag(Tag tag);

    Tag getTagById(int tagId);

    List<Tag> getAllTags();

    Tag updateTag(int tagId, Tag updateTag);

    void deleteTag(int tagId);

    Iterable<Tag> save(List<Tag> tags);
}
