/*
 * The MIT License
 *
 * Copyright 2019 asty.
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */

package no.ntnu.id101912.newsstand;

/**
 * Represents a Newspaper.
 *
 * @author asty
 */
public class Newspaper {

    private final String title; //Title of the Newspaper
    private final String publisher;
    private final int numberOfYearlyIssues;
    private final String genre;

    /**
     * Creates an instance of a Newspaper.
     *
     * @param title Title of the Newspaper
     * @param publisher Publisher of the Newspapser
     * @param numberOfYearlyIssues The number of issues issued pr year
     * @param genre Genre, like sport, travel, news etc.
     */
    public Newspaper(String title, String publisher, int numberOfYearlyIssues, String genre) {
        this.title = title;
        this.publisher = publisher;
        this.numberOfYearlyIssues = numberOfYearlyIssues;
        this.genre = genre;
    }
}
