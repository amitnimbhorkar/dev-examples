/*
 * JBoss, Home of Professional Open Source
 * Copyright 2013, Red Hat, Inc. and individual contributors
 * by the @authors tag. See the copyright.txt in the distribution for a
 * full listing of individual contributors.
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

package org.richfaces.photoalbum.service;

import java.util.List;

import javax.ejb.Local;

import org.richfaces.photoalbum.domain.Event;
import org.richfaces.photoalbum.domain.EventCategory;

@Local
public interface IEventAction {

    void addEvent(Event event) throws PhotoAlbumException;

    void deleteEvent(Event event) throws PhotoAlbumException;

    void editEvent(Event event) throws PhotoAlbumException;

    void resetEvent(Event event);
    
    List<Event> getAllEvents();
    
    List<EventCategory> getEventCategories();
    
    Event getEventById(long id);
    
    Event getEventByName(String name);
    
    EventCategory getEventCategoryById(long id);
    
    List<Event> getEventsByCategory(EventCategory ec);
    
    
}