package com.sparta.springprepare;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@RequiredArgsConstructor
@Getter
@Setter
public class Memo {
    private final String username;
    private String contents;
}

class Main {
    public static void main(String[] args) {
        Memo memo = new Memo("Robbert");

        System.out.println(memo.getUsername());
    }
}