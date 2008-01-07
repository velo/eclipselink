/*******************************************************************************
 * Copyright (c) 1998, 2007 Oracle. All rights reserved.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v1.0, which accompanies this distribution
 * and is available at http://www.eclipse.org/legal/epl-v10.html.
 *
 * Contributors:
 *     Oracle - initial API and implementation from Oracle TopLink
 ******************************************************************************/  
package org.eclipse.persistence.testing.tests.jms;

import java.util.*;

import java.rmi.server.*;

import org.eclipse.persistence.queries.*;
import org.eclipse.persistence.sessions.remote.*;
import org.eclipse.persistence.internal.sessions.remote.*;
import org.eclipse.persistence.testing.framework.*;

public class JMSTestModel extends TestModel {
    public JMSTestModel() {
        setDescription("This model performs unit tests on the JMS classes.");
    }

    public void addTests() {
    }
}
