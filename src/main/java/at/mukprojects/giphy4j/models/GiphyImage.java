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
 * This class is used to hold the image information of the response.
 *
 * @author Mathias Markl
 */
public class GiphyImage {

    @SerializedName("original")
    private GiphyOriginal original;

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
     * @param original The image.
     */
    public void setOriginal(GiphyOriginal original) {
	this.original = original;
    }

    @Override
    public String toString() {
	String outputString = "GifImage [";
	outputString += original;
	outputString += "\n    ]";
	return outputString;
    }
}
