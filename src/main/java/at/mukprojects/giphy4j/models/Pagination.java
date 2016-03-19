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
 * This class is used to hold the pagination information of the response.
 *
 * @author Mathias Markl
 */
public class Pagination {

    @SerializedName("total_count")
    private int totalCount;

    @SerializedName("count")
    private int count;

    @SerializedName("offset")
    private int offset;

    /**
     * Returns the total count of the response.
     * 
     * @return The total count.
     */
    public int getTotalCount() {
	return totalCount;
    }

    /**
     * Sets the total count of the pagination object.
     * 
     * @param totalCount
     *            The total count.
     */
    public void setTotalCount(int totalCount) {
	this.totalCount = totalCount;
    }

    /**
     * Returns the count of the response.
     * 
     * @return The count.
     */
    public int getCount() {
	return count;
    }

    /**
     * Sets the count of the pagination object.
     * 
     * @param count
     *            The count.
     */
    public void setCount(int count) {
	this.count = count;
    }

    /**
     * Returns the offset of the response.
     * 
     * @return The offset.
     */
    public int getOffset() {
	return offset;
    }

    /**
     * Sets the offset of the pagination object.
     * 
     * @param offset
     *            The offset.
     */
    public void setOffset(int offset) {
	this.offset = offset;
    }

    @Override
    public String toString() {
	return "Pagination [totalCount = " + totalCount + ", count = " + count + ", offset = " + offset + "]";
    }
}
