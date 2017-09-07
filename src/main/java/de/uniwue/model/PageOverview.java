package de.uniwue.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

public class PageOverview {
    private String id = null;
    private boolean preprocessed = false;
    private boolean segmented = false;
    private boolean segmentsExtracted = false;
    private boolean linesExtracted = false;
    private boolean hasGT = false;
    
    @Override
    public String toString() {
        return "PageOverview [id=" + id + ", preprocessed=" + preprocessed + ", segmented=" + segmented
                + ", segmentsExtracted=" + segmentsExtracted + ", linesExtracted=" + linesExtracted + ", hasGT=" + hasGT
                + "]";
    }

    public PageOverview(String id) {
        this.id = id;
    }

    public boolean isPreprocessed() {
        return preprocessed;
    }

    public void setPreprocessed(boolean preprocessed) {
        this.preprocessed = preprocessed;
    }

    public boolean isSegmented() {
        return segmented;
    }

    public void setSegmented(boolean segmented) {
        this.segmented = segmented;
    }

    public boolean isSegmentsExtracted() {
        return segmentsExtracted;
    }

    public void setSegmentsExtracted(boolean segmentsExtracted) {
        this.segmentsExtracted = segmentsExtracted;
    }

    public boolean isLinesExtracted() {
        return linesExtracted;
    }

    public void setLinesExtracted(boolean linesExtracted) {
        this.linesExtracted = linesExtracted;
    }

    public boolean isHasGT() {
        return hasGT;
    }

    public void setHasGT(boolean hasGT) {
        this.hasGT = hasGT;
    }
}

