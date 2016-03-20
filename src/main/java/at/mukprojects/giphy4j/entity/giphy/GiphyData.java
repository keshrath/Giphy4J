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
 * This class is used to hold the image data of the response.
 *
 * @author Mathias Markl
 */
public class GiphyData {

    @SerializedName("type")
    private String type;

    @SerializedName("id")
    private String id;

    @SerializedName("slug")
    private String slug;

    @SerializedName("url")
    private String url;

    @SerializedName("bitly_gif_url")
    private String bitlyGifUrl;

    @SerializedName("bitly_url")
    private String bitlyUrl;

    @SerializedName("embed_url")
    private String embedUrl;

    @SerializedName("username")
    private String username;

    @SerializedName("source")
    private String source;

    @SerializedName("rating")
    private String rating;

    @SerializedName("content_url")
    private String contentUrl;

    @SerializedName("source_tld")
    private String sourceTld;

    @SerializedName("source_post_url")
    private String sourcePostUrl;

    @SerializedName("import_datetime")
    private String importDatetime;

    @SerializedName("trending_datetime")
    private String trendingDatetime;

    @SerializedName("images")
    private GiphyContainer images;

    /**
     * Returns the type.
     * 
     * @return The type.
     */
    public String getType() {
	return type;
    }

    /**
     * Sets the type.
     * 
     * @param type
     *            The type.
     */
    public void setType(String type) {
	this.type = type;
    }

    /**
     * Returns the id.
     * 
     * @return The id.
     */
    public String getId() {
	return id;
    }

    /**
     * Sets the id.
     * 
     * @param id
     *            The id.
     */
    public void setId(String id) {
	this.id = id;
    }

    /**
     * Returns the slug.
     * 
     * @return The slug.
     */
    public String getSlug() {
	return slug;
    }

    /**
     * Sets the slug.
     * 
     * @param slug
     *            The slug.
     */
    public void setSlug(String slug) {
	this.slug = slug;
    }

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
     * Returns the bitly GIF URL.
     * 
     * @return The bitly GIF URL.
     */
    public String getBitlyGifUrl() {
	return bitlyGifUrl;
    }

    /**
     * Sets the bitly GIF URL.
     * 
     * @param bitlyGifUrl
     *            The bitly GIF URL.
     */
    public void setBitlyGifUrl(String bitlyGifUrl) {
	this.bitlyGifUrl = bitlyGifUrl;
    }

    /**
     * Returns the bitly URL.
     * 
     * @return The bitly URL.
     */
    public String getBitlyUrl() {
	return bitlyUrl;
    }

    /**
     * Sets the bitly URL.
     * 
     * @param bitlyGifUrl
     *            The bitly URL.
     */
    public void setBitlyUrl(String bitlyUrl) {
	this.bitlyUrl = bitlyUrl;
    }

    /**
     * Returns the embed URL.
     * 
     * @return The embed URL.
     */
    public String getEmbedUrl() {
	return embedUrl;
    }

    /**
     * Sets the embed URL.
     * 
     * @param bitlyGifUrl
     *            The embed URL.
     */
    public void setEmbedUrl(String embedUrl) {
	this.embedUrl = embedUrl;
    }

    /**
     * Returns the username.
     * 
     * @return The username.
     */
    public String getUsername() {
	return username;
    }

    /**
     * Sets the username.
     * 
     * @param username
     *            The username.
     */
    public void setUsername(String username) {
	this.username = username;
    }

    /**
     * Returns the source.
     * 
     * @return The source.
     */
    public String getSource() {
	return source;
    }

    /**
     * Sets the source.
     * 
     * @param source
     *            The source.
     */
    public void setSource(String source) {
	this.source = source;
    }

    /**
     * Returns the rating.
     * 
     * @return The rating.
     */
    public String getRating() {
	return rating;
    }

    /**
     * Sets the rating.
     * 
     * @param rating
     *            The rating.
     */
    public void setRating(String rating) {
	this.rating = rating;
    }

    /**
     * Returns the contentUrl.
     * 
     * @return The contentUrl.
     */
    public String getContentUrl() {
	return contentUrl;
    }

    /**
     * Sets the contentUrl.
     * 
     * @param contentUrl
     *            The contentUrl.
     */
    public void setContentUrl(String contentUrl) {
	this.contentUrl = contentUrl;
    }

    /**
     * Returns the sourceTld.
     * 
     * @return The sourceTld.
     */
    public String getSourceTld() {
	return sourceTld;
    }

    /**
     * Sets the sourceTld.
     * 
     * @param sourceTld
     *            The sourceTld.
     */
    public void setSourceTld(String sourceTld) {
	this.sourceTld = sourceTld;
    }

    /**
     * Returns the sourcePostUrl.
     * 
     * @return The sourcePostUrl.
     */
    public String getSourcePostUrl() {
	return sourcePostUrl;
    }

    /**
     * Sets the sourcePostUrl.
     * 
     * @param sourcePostUrl
     *            The sourcePostUrl.
     */
    public void setSourcePostUrl(String sourcePostUrl) {
	this.sourcePostUrl = sourcePostUrl;
    }

    /**
     * Returns the importDatetime.
     * 
     * @return The importDatetime.
     */
    public String getImportDatetime() {
	return importDatetime;
    }

    /**
     * Sets the importDatetime.
     * 
     * @param importDatetime
     *            The importDatetime.
     */
    public void setImportDatetime(String importDatetime) {
	this.importDatetime = importDatetime;
    }

    /**
     * Returns the trendingDatetime.
     * 
     * @return The trendingDatetime.
     */
    public String getTrendingDatetime() {
	return trendingDatetime;
    }

    /**
     * Sets the trendingDatetime.
     * 
     * @param trendingDatetime
     *            The trendingDatetime.
     */
    public void setTrendingDatetime(String trendingDatetime) {
	this.trendingDatetime = trendingDatetime;
    }

    /**
     * Returns the image.
     * 
     * @return The image.
     */
    public GiphyContainer getImages() {
	return images;
    }

    /**
     * Sets the image.
     * 
     * @param images
     *            The image.
     */
    public void setImages(GiphyContainer images) {
	this.images = images;
    }

    @Override
    public String toString() {
	String outputString = "GifData [";
	outputString += "\n    id = " + id;
	outputString += "\n    slug = " + slug;
	outputString += "\n    url = " + url;
	outputString += "\n    " + images;
	outputString += "\n  ]";
	return outputString;
    }
}
