package model;

import java.util.List;
import java.util.Collections;

public class RhumBank {
    private List<Rhum> mRhumList;
    private int mNextRhumIndex;

    public List<Rhum> getRhumList() {
        return mRhumList;
    }

    public void setRhumList(List<Rhum> rhumList) {
        mRhumList = rhumList;
    }

    public int getNextRhumIndex() {
        return mNextRhumIndex;
    }

    public void setNextRhumIndex(int nextRhumIndex) {
        mNextRhumIndex = nextRhumIndex;
    }

    public RhumBank(List<Rhum> rhumList) {
        mRhumList = rhumList;

        mNextRhumIndex = 1;
    }

    public Rhum getRhum(int id) {

        return mRhumList.get(id);
    }

}
