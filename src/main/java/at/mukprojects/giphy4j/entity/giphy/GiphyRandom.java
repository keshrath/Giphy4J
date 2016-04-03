/** 
 * This code is copyright (c) Mathias Markl 2016
 * 
 * This program is free software: you can redistribute it and/or modify it under
 * the terms of the GNU General Public License as published by the Free Software
 * Foundation, either version 3 of the License, or (at your option) any later
 * version.
 * 
 * This program is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU General Public License for more
 * details.
 * 
 * You should have received a copy of the GNU General Public License along with
 * this program. If not, see <http://www.gnu.org/licenses/>.
 */

package at.mukprojects.giphy4j.entity.giphy;

import com.google.gson.annotations.SerializedName;

/**
 * This class represents the random response message.
 * 
 * @author Mathias Markl
 */
public class GiphyRandom {

    @SerializedName("type")
    private String type;

    @SerializedName("id")
    private String id;

    @SerializedName("url")
    private String url;

    @SerializedName("image_original_url")
    private String imageOriginalUrl;

    @SerializedName("image_url")
    private String imageUrl;

    @SerializedName("image_mp4_url")
    private String imageMp4Url;

    @SerializedName("image_frames")
    private String imageFrames;

    @SerializedName("image_width")
    private String imageWidth;

    @SerializedName("image_height")
    private String imageHeight;

    @SerializedName("fixed_height_downsampled_url")
    private String fixedHeightDownsampledUrl;

    @SerializedName("fixed_height_downsampled_width")
    private String fixedHeightDownsampledWidth;

    @SerializedName("fixed_height_downsampled_height")
    private String fixedHeightDownsampledHeight;

    @SerializedName("fixed_width_downsampled_url")
    private String fixedWidthDownsampledUrl;

    @SerializedName("fixed_width_downsampled_width")
    private String fixedWidthDownsampledWidth;

    @SerializedName("fixed_width_downsampled_height")
    private String fixedWidthDownsampledHeight;

    @SerializedName("fixed_height_small_url")
    private String fixedHeightSmallUrl;

    @SerializedName("fixed_height_small_still_url")
    private String fixedHeightSmallStillUrl;

    @SerializedName("fixed_height_small_width")
    private String fixedHeightSmallWidth;

    @SerializedName("fixed_height_small_height")
    private String fixedHeightSmallHeight;

    @SerializedName("fixed_width_small_url")
    private String fixedWidthSmallUrl;

    @SerializedName("fixed_width_small_still_url")
    private String fixedWidthSmallStillUrl;

    @SerializedName("fixed_width_small_width")
    private String fixedWidthSmallWidth;

    @SerializedName("fixed_width_small_height")
    private String fixedWidthSmallHeight;

    /**
     * Returns the type.
     * 
     * @return the type
     */
    public String getType() {
	return type;
    }

    /**
     * Sets the type.
     * 
     * @param type
     *            the type
     */
    public void setType(String type) {
	this.type = type;
    }

    /**
     * Returns the id.
     * 
     * @return the id
     */
    public String getId() {
	return id;
    }

    /**
     * Sets the id.
     * 
     * @param id
     *            the id
     */
    public void setId(String id) {
	this.id = id;
    }

    /**
     * Returns the URL.
     * 
     * @return the URL
     */
    public String getUrl() {
	return url;
    }

    /**
     * Sets the URL.
     * 
     * @param url
     *            the URL
     */
    public void setUrl(String url) {
	this.url = url;
    }

    /**
     * Returns the original image URL.
     * 
     * @return the original image URL
     */
    public String getImageOriginalUrl() {
	return imageOriginalUrl;
    }

    /**
     * Sets the original image URL.
     * 
     * @param imageOriginalUrl
     *            the original image URL
     */
    public void setImageOriginalUrl(String imageOriginalUrl) {
	this.imageOriginalUrl = imageOriginalUrl;
    }

    /**
     * Returns the image URL.
     * 
     * @return the image URL
     */
    public String getImageUrl() {
	return imageUrl;
    }

    /**
     * Sets the image URL.
     * 
     * @param imageUrl
     *            the image URL
     */
    public void setImageUrl(String imageUrl) {
	this.imageUrl = imageUrl;
    }

    /**
     * Returns the image mp4 URL.
     * 
     * @return the image mp4 URL
     */
    public String getImageMp4Url() {
	return imageMp4Url;
    }

    /**
     * Sets the image mp4 URL.
     * 
     * @param imageMp4Url
     *            the image mp4 URL
     */
    public void setImageMp4Url(String imageMp4Url) {
	this.imageMp4Url = imageMp4Url;
    }

    /**
     * Returns the image frames.
     * 
     * @return the frames
     */
    public String getImageFrames() {
	return imageFrames;
    }

    /**
     * Sets the image frames.
     * 
     * @param imageFrames
     *            the frames.
     */
    public void setImageFrames(String imageFrames) {
	this.imageFrames = imageFrames;
    }

    /**
     * Returns the width.
     * 
     * @return the width
     */
    public String getImageWidth() {
	return imageWidth;
    }

    /**
     * Sets the width.
     * 
     * @param imageWidth
     *            the width
     */
    public void setImageWidth(String imageWidth) {
	this.imageWidth = imageWidth;
    }

    /**
     * Returns the height.
     * 
     * @return the height
     */
    public String getImageHeight() {
	return imageHeight;
    }

    /**
     * Sets the height.
     * 
     * @param imageHeight
     *            the height
     */
    public void setImageHeight(String imageHeight) {
	this.imageHeight = imageHeight;
    }

    /**
     * Returns the downsampled URL.
     * 
     * @return the downsampled URL
     */
    public String getFixedHeightDownsampledUrl() {
	return fixedHeightDownsampledUrl;
    }

    /**
     * Sets the downsampled URL
     * 
     * @param fixedHeightDownsampledUrl
     *            the downsampled URL
     */
    public void setFixedHeightDownsampledUrl(String fixedHeightDownsampledUrl) {
	this.fixedHeightDownsampledUrl = fixedHeightDownsampledUrl;
    }

    /**
     * Returns the fixed height downsampled width.
     * 
     * @return the fixed height downsampled width
     */
    public String getFixedHeightDownsampledWidth() {
	return fixedHeightDownsampledWidth;
    }

    /**
     * Sets the fixed height downsampled width
     * 
     * @param fixedHeightDownsampledWidth
     *            the fixed height downsampled width
     */
    public void setFixedHeightDownsampledWidth(String fixedHeightDownsampledWidth) {
	this.fixedHeightDownsampledWidth = fixedHeightDownsampledWidth;
    }

    /**
     * Returns the fixed height downsampled height.
     * 
     * @return the fixed height downsampled height
     */
    public String getFixedHeightDownsampledHeight() {
	return fixedHeightDownsampledHeight;
    }

    /**
     * Sets the fixed height downsampled height.
     * 
     * @param fixedHeightDownsampledHeight
     *            the fixed height downsampled height
     */
    public void setFixedHeightDownsampledHeight(String fixedHeightDownsampledHeight) {
	this.fixedHeightDownsampledHeight = fixedHeightDownsampledHeight;
    }

    /**
     * Returns the fixed width downsampled URL.
     * 
     * @return the fixed width downsampled URL
     */
    public String getFixedWidthDownsampledUrl() {
	return fixedWidthDownsampledUrl;
    }

    /**
     * Sets the fixed width downsampled URL.
     * 
     * @param fixedWidthDownsampledUrl
     *            the fixed width downsampled URL
     */
    public void setFixedWidthDownsampledUrl(String fixedWidthDownsampledUrl) {
	this.fixedWidthDownsampledUrl = fixedWidthDownsampledUrl;
    }

    /**
     * Returns the fixed width downsampled width.
     * 
     * @return the fixed width downsampled width
     */
    public String getFixedWidthDownsampledWidth() {
	return fixedWidthDownsampledWidth;
    }

    /**
     * Sets the fixed width downsampled width.
     * 
     * @param fixedWidthDownsampledUrl
     *            the fixed width downsampled width
     */
    public void setFixedWidthDownsampledWidth(String fixedWidthDownsampledWidth) {
	this.fixedWidthDownsampledWidth = fixedWidthDownsampledWidth;
    }

    /**
     * Returns the fixed width downsampled height.
     * 
     * @return the fixed width downsampled height
     */
    public String getFixedWidthDownsampledHeight() {
	return fixedWidthDownsampledHeight;
    }

    /**
     * Sets the fixed width downsampled height.
     * 
     * @param fixedWidthDownsampledHeight
     *            the fixed width downsampled height
     */
    public void setFixedWidthDownsampledHeight(String fixedWidthDownsampledHeight) {
	this.fixedWidthDownsampledHeight = fixedWidthDownsampledHeight;
    }

    /**
     * Returns the fixed height small URL.
     * 
     * @return the fixed height small URL
     */
    public String getFixedHeightSmallUrl() {
	return fixedHeightSmallUrl;
    }

    /**
     * Sets the fixed height small URL.
     * 
     * @param fixedHeightSmallUrl
     *            the fixed height small URL
     */
    public void setFixedHeightSmallUrl(String fixedHeightSmallUrl) {
	this.fixedHeightSmallUrl = fixedHeightSmallUrl;
    }

    /**
     * Returns the fixed height small still URL.
     * 
     * @return the fixed height small still URL
     */
    public String getFixedHeightSmallStillUrl() {
	return fixedHeightSmallStillUrl;
    }

    /**
     * Sets the fixed height small still URL.
     * 
     * @param fixedHeightSmallStillUrl
     *            the fixed height small still URL
     */
    public void setFixedHeightSmallStillUrl(String fixedHeightSmallStillUrl) {
	this.fixedHeightSmallStillUrl = fixedHeightSmallStillUrl;
    }

    /**
     * Returns the fixed height small width.
     * 
     * @return the fixed height small width
     */
    public String getFixedHeightSmallWidth() {
	return fixedHeightSmallWidth;
    }

    /**
     * Sets the fixed height small width.
     * 
     * @param fixedHeightSmallWidth
     *            the fixed height small width
     */
    public void setFixedHeightSmallWidth(String fixedHeightSmallWidth) {
	this.fixedHeightSmallWidth = fixedHeightSmallWidth;
    }

    /**
     * Returns the fixed height small height.
     * 
     * @return the fixed height small height
     */
    public String getFixedHeightSmallHeight() {
	return fixedHeightSmallHeight;
    }

    /**
     * Sets the fixed height small height.
     * 
     * @param fixedHeightSmallHeight
     *            the fixed height small height
     */
    public void setFixedHeightSmallHeight(String fixedHeightSmallHeight) {
	this.fixedHeightSmallHeight = fixedHeightSmallHeight;
    }

    /**
     * Returns the fixed width small URL.
     * 
     * @return the fixed width small URL
     */
    public String getFixedWidthSmallUrl() {
	return fixedWidthSmallUrl;
    }

    /**
     * Sets the fixed width small height.
     * 
     * @param fixedWidthSmallUrl
     *            the fixed width small height
     */
    public void setFixedWidthSmallUrl(String fixedWidthSmallUrl) {
	this.fixedWidthSmallUrl = fixedWidthSmallUrl;
    }

    /**
     * Returns the fixed width small still URL.
     * 
     * @return the fixed width small still URL
     */
    public String getFixedWidthSmallStillUrl() {
	return fixedWidthSmallStillUrl;
    }

    /**
     * Sets the fixed width small still URL.
     * 
     * @param fixedWidthSmallStillUrl
     *            the fixed width small still URL
     */
    public void setFixedWidthSmallStillUrl(String fixedWidthSmallStillUrl) {
	this.fixedWidthSmallStillUrl = fixedWidthSmallStillUrl;
    }

    /**
     * Returns the fixed width small height.
     * 
     * @return the fixed width small height
     */
    public String getFixedWidthSmallWidth() {
	return fixedWidthSmallWidth;
    }

    /**
     * Sets the fixed width small height.
     * 
     * @param fixedWidthSmallWidth
     *            the fixed width small height
     */
    public void setFixedWidthSmallWidth(String fixedWidthSmallWidth) {
	this.fixedWidthSmallWidth = fixedWidthSmallWidth;
    }

    /**
     * Returns the fixed width small height.
     * 
     * @return the fixed width small height
     */
    public String getFixedWidthSmallHeight() {
	return fixedWidthSmallHeight;
    }

    /**
     * Sets the fixed width small height.
     * 
     * @param fixedWidthSmallHeight
     *            the fixed width small height
     */
    public void setFixedWidthSmallHeight(String fixedWidthSmallHeight) {
	this.fixedWidthSmallHeight = fixedWidthSmallHeight;
    }

}
