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
 * This class is used to hold the image information of the response.
 *
 * @author Mathias Markl
 */
public class GiphyContainer {

    @SerializedName("fixed_height")
    private GiphyImage fixedHeight;

    @SerializedName("fixed_height_still")
    private GiphyImage fixedHeightStill;

    @SerializedName("fixed_height_downsampled")
    private GiphyImage fixedHeightDownsampled;

    @SerializedName("fixed_width")
    private GiphyImage fixedWidth;

    @SerializedName("fixed_width_still")
    private GiphyImage fixedWidthStill;

    @SerializedName("fixed_width_downsampled")
    private GiphyImage fixedWidthDownsampled;

    @SerializedName("fixed_height_small")
    private GiphyImage fixedHeightSmall;

    @SerializedName("fixed_height_small_still")
    private GiphyImage fixedHeightSmallStill;

    @SerializedName("fixed_width_small")
    private GiphyImage fixedWidthSmall;

    @SerializedName("fixed_width_small_still")
    private GiphyImage fixedWidthSmallStill;

    @SerializedName("downsized")
    private GiphyImage downsized;

    @SerializedName("downsized_still")
    private GiphyImage downsizedStill;

    @SerializedName("downsized_large")
    private GiphyImage downsizedLarge;

    @SerializedName("original")
    private GiphyOriginal original;

    @SerializedName("original_still")
    private GiphyImage originalStill;

    @SerializedName("looping")
    private GiphyImage looping;
    
    public GiphyImage getFixedHeight() {
	return fixedHeight;
    }

    public void setFixedHeight(GiphyImage fixedHeight) {
	this.fixedHeight = fixedHeight;
    }

    public GiphyImage getFixedHeightStill() {
	return fixedHeightStill;
    }

    public void setFixedHeightStill(GiphyImage fixedHeightStill) {
	this.fixedHeightStill = fixedHeightStill;
    }

    public GiphyImage getFixedHeightDownsampled() {
	return fixedHeightDownsampled;
    }

    public void setFixedHeightDownsampled(GiphyImage fixedHeightDownsampled) {
	this.fixedHeightDownsampled = fixedHeightDownsampled;
    }

    public GiphyImage getFixedWidth() {
	return fixedWidth;
    }

    public void setFixedWidth(GiphyImage fixedWidth) {
	this.fixedWidth = fixedWidth;
    }

    public GiphyImage getFixedWidthStill() {
	return fixedWidthStill;
    }

    public void setFixedWidthStill(GiphyImage fixedWidthStill) {
	this.fixedWidthStill = fixedWidthStill;
    }

    public GiphyImage getFixedWidthDownsampled() {
	return fixedWidthDownsampled;
    }

    public void setFixedWidthDownsampled(GiphyImage fixedWidthDownsampled) {
	this.fixedWidthDownsampled = fixedWidthDownsampled;
    }

    public GiphyImage getFixedHeightSmall() {
	return fixedHeightSmall;
    }

    public void setFixedHeightSmall(GiphyImage fixedHeightSmall) {
	this.fixedHeightSmall = fixedHeightSmall;
    }

    public GiphyImage getFixedHeightSmallStill() {
	return fixedHeightSmallStill;
    }

    public void setFixedHeightSmallStill(GiphyImage fixedHeightSmallStill) {
	this.fixedHeightSmallStill = fixedHeightSmallStill;
    }

    public GiphyImage getFixedWidthSmall() {
	return fixedWidthSmall;
    }

    public void setFixedWidthSmall(GiphyImage fixedWidthSmall) {
	this.fixedWidthSmall = fixedWidthSmall;
    }

    public GiphyImage getFixedWidthSmallStill() {
	return fixedWidthSmallStill;
    }

    public void setFixedWidthSmallStill(GiphyImage fixedWidthSmallStill) {
	this.fixedWidthSmallStill = fixedWidthSmallStill;
    }

    public GiphyImage getDownsized() {
	return downsized;
    }

    public void setDownsized(GiphyImage downsized) {
	this.downsized = downsized;
    }

    public GiphyImage getDownsizedStill() {
	return downsizedStill;
    }

    public void setDownsizedStill(GiphyImage downsizedStill) {
	this.downsizedStill = downsizedStill;
    }

    public GiphyImage getDownsizedLarge() {
	return downsizedLarge;
    }

    public void setDownsizedLarge(GiphyImage downsizedLarge) {
	this.downsizedLarge = downsizedLarge;
    }

    /**
     * Returns the image.
     * 
     * @return The image.
     */
    public GiphyOriginal getOriginal() {
	return original;
    }

    /**
     * Sets the image.
     * 
     * @param original
     *            The image.
     */
    public void setOriginal(GiphyOriginal original) {
	this.original = original;
    }

    public GiphyImage getOriginalStill() {
	return originalStill;
    }

    public void setOriginalStill(GiphyImage originalStill) {
	this.originalStill = originalStill;
    }
    
    public GiphyImage getLooping() {
        return looping;
    }

    public void setLooping(GiphyImage looping) {
        this.looping = looping;
    }

    @Override
    public String toString() {
	String outputString = "GifImage [";
	outputString += original;
	outputString += "\n    ]";
	return outputString;
    }
}
