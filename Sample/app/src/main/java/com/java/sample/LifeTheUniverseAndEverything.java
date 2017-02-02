package com.java.sample;

import android.os.Build;
import android.support.annotation.RequiresApi;

import java.io.BufferedReader;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;
 
public class LifeTheUniverseAndEverything implements Closeable {
 
    private InputReader in = new InputReader(System.in);
    private PrintWriter out = new PrintWriter(System.out);
 
    public void solve() {
        int next;
        while ((next = in.ni()) != 42) {
            out.println(next);
        }
    }
 
    @Override
    public void close() throws IOException {
        in.close();
        out.close();
    }
 
    static class InputReader {
        public BufferedReader reader;
        public StringTokenizer tokenizer;
 
        public InputReader(InputStream stream) {
            reader = new BufferedReader(new InputStreamReader(stream), 32768);
            tokenizer = null;
        }
 
        public String next() {
            while (tokenizer == null || !tokenizer.hasMoreTokens()) {
                try {
                    tokenizer = new StringTokenizer(reader.readLine());
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
            return tokenizer.nextToken();
        }
 
        public int ni() {
            return Integer.parseInt(next());
        }
 
        public long nl() {
            return Long.parseLong(next());
        }
 
        public void close() throws IOException {
            reader.close();
        }
    }
 
    @RequiresApi(api = Build.VERSION_CODES.KITKAT)
    public static void main(String[] args) throws IOException {
        try (LifeTheUniverseAndEverything instance = new LifeTheUniverseAndEverything()) {
            instance.solve();
        }
    }
}