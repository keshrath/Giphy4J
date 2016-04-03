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

package at.mukprojects.giphy4j.dao;

import java.io.IOException;

import at.mukprojects.giphy4j.http.Request;
import at.mukprojects.giphy4j.http.Response;

/**
 * An RequestSender is able to send a request by passing the URL to it. After
 * processing the request a response is returned.
 * 
 * @author Mathias Markl
 */
public interface RequestSender {

    /**
     * Sends the request and returns the received response.
     * 
     * @param request
     *            the request which will be send
     * @return the received response
     * @throws IOException
     *             if an error occurred
     */
    public Response sendRequest(Request request) throws IOException;

}
