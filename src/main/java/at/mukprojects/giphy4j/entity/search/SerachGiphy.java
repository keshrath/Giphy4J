package at.mukprojects.giphy4j.entity.search;

import com.google.gson.annotations.SerializedName;

import at.mukprojects.giphy4j.entity.common.Meta;
import at.mukprojects.giphy4j.entity.giphy.GiphyData;

public class SerachGiphy {
    @SerializedName("data")
    private GiphyData data;

    @SerializedName("meta")
    private Meta meta;

    public GiphyData getData() {
	return data;
    }

    public void setData(GiphyData data) {
	this.data = data;
    }

    public Meta getMeta() {
	return meta;
    }

    public void setMeta(Meta meta) {
	this.meta = meta;
    }
    
    @Override
    public String toString() {
	String outputString = "SearchFeed [";
	outputString += "\n  " + data;
	outputString += "\n  " + meta + "\n]";
	return outputString;
    }
}
