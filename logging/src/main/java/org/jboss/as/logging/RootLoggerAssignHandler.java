/*
 * JBoss, Home of Professional Open Source.
 * Copyright 2011, Red Hat, Inc., and individual contributors
 * as indicated by the @author tags. See the copyright.txt file in the
 * distribution for a full listing of individual contributors.
 *
 * This is free software; you can redistribute it and/or modify it
 * under the terms of the GNU Lesser General Public License as
 * published by the Free Software Foundation; either version 2.1 of
 * the License, or (at your option) any later version.
 *
 * This software is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this software; if not, write to the Free
 * Software Foundation, Inc., 51 Franklin St, Fifth Floor, Boston, MA
 * 02110-1301 USA, or see the FSF site: http://www.fsf.org.
 */

package org.jboss.as.logging;

import org.jboss.as.controller.OperationFailedException;
import org.jboss.dmr.ModelNode;

import java.util.Collection;

import static org.jboss.as.logging.CommonAttributes.HANDLERS;
import static org.jboss.as.logging.CommonAttributes.ROOT_LOGGER;


/**
 * Operation responsible assigning a handler to root-logger.
 *
 * @author Stan Silvert
 */
public class RootLoggerAssignHandler extends LoggerAssignHandler {
    static final String OPERATION_NAME = "root-logger-assign-handler";
    static final RootLoggerAssignHandler INSTANCE = new RootLoggerAssignHandler();

    @Override
    protected ModelNode getParent(final ModelNode model) {
        return model.get(ROOT_LOGGER);
    }

    @Override
    protected String getLoggerName(ModelNode operation) {
        return "";
    }
}
