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

package at.mukprojects.giphy4j.entity.common;

import com.google.gson.annotations.SerializedName;

/**
 * This class is used to hold the meta information of the response.
 *
 * @author Mathias Markl
 */
public class Meta {

    @SerializedName("status")
    private int status;

    @SerializedName("msg")
    private String msg;

    /**
     * Returns the status.
     * 
     * @return the status as an integer value
     */
    public int getStatus() {
	return status;
    }

    /**
     * Sets the status information of the meta object.
     * 
     * @param status
     *            the status
     */
    public void setStatus(int status) {
	this.status = status;
    }

    /**
     * Returns the meta message.
     * 
     * @return the message
     */
    public String getMsg() {
	return msg;
    }

    /**
     * Sets the message of the meta object.
     * 
     * @param msg
     *            the message
     */
    public void setMsg(String msg) {
	this.msg = msg;
    }

    @Override
    public String toString() {
	return "Meta [status = " + status + ", msg = " + msg + "]";
    }
}
