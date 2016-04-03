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

package at.mukprojects.giphy4j.entity.search;

import java.util.List;

import com.google.gson.annotations.SerializedName;

import at.mukprojects.giphy4j.entity.common.Meta;
import at.mukprojects.giphy4j.entity.common.Pagination;
import at.mukprojects.giphy4j.entity.giphy.GiphyData;

/**
 * This class represents a search feed response.
 *
 * @author Mathias Markl
 */
public class SearchFeed {

    @SerializedName("data")
    private List<GiphyData> dataList;

    @SerializedName("meta")
    private Meta meta;

    @SerializedName("pagination")
    private Pagination pagination;

    /**
     * Returns the data list.
     * 
     * <p>
     * "data": [ ... ],
     * 
     * @return the data list
     */
    public List<GiphyData> getDataList() {
	return dataList;
    }

    /**
     * Sets the data list.
     * 
     * @param dataList
     *            the data list
     */
    public void setDataList(List<GiphyData> dataList) {
	this.dataList = dataList;
    }

    /**
     * Returns the meta information object.
     * 
     * <p>
     * "meta": { ... },
     * 
     * @return the meta information object
     */
    public Meta getMeta() {
	return meta;
    }

    /**
     * Sets the meta object.
     * 
     * @param meta
     *            the meta object
     */
    public void setMeta(Meta meta) {
	this.meta = meta;
    }

    /**
     * Returns the pagination object.
     * 
     * <p>
     * "pagination": { ... }
     * 
     * @return the pagination object
     */
    public Pagination getPagination() {
	return pagination;
    }

    /**
     * Sets the pagination object.
     * 
     * @param pagination
     *            the pagination object
     */
    public void setPagination(Pagination pagination) {
	this.pagination = pagination;
    }

    @Override
    public String toString() {
	String outputString = "SearchFeed [";
	for (GiphyData data : dataList) {
	    outputString += "\n  " + data;
	}
	outputString += "\n  " + meta + "\n  " + pagination + "\n]";
	return outputString;
    }
}
