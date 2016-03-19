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

package at.mukprojects.giphy4j.models;

import com.google.gson.annotations.SerializedName;

/**
 * This class represents the image file.
 *
 * @author Mathias Markl
 */
public class Gif {

    @SerializedName("url")
    private String url;

    @SerializedName("width")
    private String width;

    @SerializedName("height")
    private String height;

    @SerializedName("size")
    private String size;

    @SerializedName("frames")
    private String frames;

    @SerializedName("mp4")
    private String mp4;

    @SerializedName("mp4_size")
    private String mp4Size;

    @SerializedName("webp")
    private String webp;

    @SerializedName("webp_size")
    private String webpSize;

    /**
     * Returns the URL.
     * 
     * @return The URL.
     */
    public String getUrl() {
	return url;
    }

    /**
     * Sets the URL.
     * 
     * @param url
     *            The URL.
     */
    public void setUrl(String url) {
	this.url = url;
    }

    /**
     * Returns the width.
     * 
     * @return The width of the image.
     */
    public String getWidth() {
	return width;
    }

    /**
     * Sets the width.
     * 
     * @param width
     *            The width.
     */
    public void setWidth(String width) {
	this.width = width;
    }

    /**
     * Returns the height.
     * 
     * @return The height of the image.
     */
    public String getHeight() {
	return height;
    }

    /**
     * Sets the height.
     * 
     * @param width
     *            The height.
     */
    public void setHeight(String height) {
	this.height = height;
    }

    /**
     * Returns the size.
     * 
     * @return The size.
     */
    public String getSize() {
	return size;
    }

    /**
     * Sets the size.
     * 
     * @param size
     *            The size.
     */
    public void setSize(String size) {
	this.size = size;
    }

    /**
     * Returns the frame count.
     * 
     * @return The frame count.
     */
    public String getFrames() {
	return frames;
    }

    /**
     * Sets the frame count.
     * 
     * @param frames
     *            The frame count.
     */
    public void setFrames(String frames) {
	this.frames = frames;
    }

    /**
     * Returns the mp4 URL.
     * 
     * @return The mp4 URL.
     */
    public String getMp4() {
	return mp4;
    }

    /**
     * Sets the mp4 URL.
     * 
     * @param mp4
     *            The mp4 URL.
     */
    public void setMp4(String mp4) {
	this.mp4 = mp4;
    }

    /**
     * Returns the mp4 size.
     * 
     * @return The mp4 size.
     */
    public String getMp4Size() {
	return mp4Size;
    }

    /**
     * Sets the mp4 size.
     * 
     * @param mp4
     *            The mp4 size.
     */
    public void setMp4Size(String mp4Size) {
	this.mp4Size = mp4Size;
    }

    public String getWebp() {
	return webp;
    }

    /**
     * Sets the webp URL.
     * 
     * @param webp
     *            The webp URL.
     */
    public void setWebp(String webp) {
	this.webp = webp;
    }

    public String getWebpSize() {
	return webpSize;
    }

    /**
     * Sets the webp size.
     * 
     * @param webp
     *            The webp size.
     */
    public void setWebpSize(String webpSize) {
	this.webpSize = webpSize;
    }

    @Override
    public String toString() {
	String outputString = "";
	outputString += "\n      url = " + url;
	outputString += "\n      width = " + width;
	outputString += "\n      height = " + height;
	outputString += "\n      size = " + size;
	outputString += "\n      frames = " + frames;
	outputString += "\n      mp4 = " + mp4;
	outputString += "\n      mp4Size = " + mp4Size;
	outputString += "\n      webp = " + webp;
	outputString += "\n      webpSize = " + webpSize;
	return outputString;
    }

}
