package com.jbl.book.springboot.web;

import com.jbl.book.springboot.service.PostsService;
import com.jbl.book.springboot.web.dto.PostsResponseDto;
import com.jbl.book.springboot.web.dto.PostsSaveRequestsDto;
import com.jbl.book.springboot.web.dto.PostsUpdateRequestDto;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RequiredArgsConstructor
@RestController
public class PostsApiController {

    private final PostsService postsService;


    @PostMapping("/api/v1/posts")
    public Long save(@RequestBody PostsSaveRequestsDto requestsDto) {
        return postsService.save(requestsDto);
    }

    @PutMapping("/api/v1/posts/{id}")
    public Long update(@PathVariable Long id, @RequestBody PostsUpdateRequestDto requestDto) {
        return postsService.update(id, requestDto);
    }

    @GetMapping("/api/v1/posts/{id}")
    public PostsResponseDto findById (@PathVariable Long id) {
        return postsService.findById(id);
    }
}

// 스프링에선 Bean을 주입 받는 방식들이 다음과 같다
// @Autowired, setter, 생성자
// 이 중 가장 권하는 방식은 생성자로 주입받는 방식 (@Autowired는 권장하지 않는다 함)
// 생성자로 Bean 객체를 받도록 하면 @Autowired와 동일한 효과를 볼 수 있음

// @RequiredArgsContructor에서 해결 해줌, final이 선언된 모든 필드를 인자값으로 하는 생성자를 롬복의
// @RequiredArgsContructor가 대신 생성 해줌

