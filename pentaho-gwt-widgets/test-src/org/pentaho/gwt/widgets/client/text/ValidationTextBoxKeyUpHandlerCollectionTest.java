/*!
* This program is free software; you can redistribute it and/or modify it under the
* terms of the GNU Lesser General Public License, version 2.1 as published by the Free Software
* Foundation.
*
* You should have received a copy of the GNU Lesser General Public License along with this
* program; if not, you can obtain a copy at http://www.gnu.org/licenses/old-licenses/lgpl-2.1.html
* or from the Free Software Foundation, Inc.,
* 51 Franklin Street, Fifth Floor, Boston, MA 02110-1301 USA.
*
* This program is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY;
* without even the implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.
* See the GNU Lesser General Public License for more details.
*
* Copyright (c) 2002-2015 Pentaho Corporation..  All rights reserved.
*/

package org.pentaho.gwt.widgets.client.text;

import com.google.gwt.event.dom.client.KeyUpEvent;
import com.google.gwt.event.dom.client.KeyUpHandler;
import com.google.gwtmockito.GwtMockitoTestRunner;
import org.junit.Test;
import org.junit.runner.RunWith;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

@RunWith( GwtMockitoTestRunner.class )
public class ValidationTextBoxKeyUpHandlerCollectionTest {

  @Test
  public void testFireOnKeyUp() throws Exception {
    ValidationTextBoxKeyUpHandlerCollection handlers = new ValidationTextBoxKeyUpHandlerCollection();
    final KeyUpHandler handler = mock( KeyUpHandler.class );
    handlers.add( handler );

    final KeyUpEvent event = mock( KeyUpEvent.class );
    handlers.fireOnKeyUp( event );
    verify( handler ).onKeyUp( event );
  }
}
