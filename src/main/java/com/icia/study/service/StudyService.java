package com.icia.study.service;

import com.icia.study.dto.StudyDTO;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import java.util.ArrayList;
import java.util.List;

@Service
public class StudyService {
    public void req1(){
        System.out.println("StudyService.req1");
    }

    // req2 메서드에서 p1, p2값 출력
    public void req2(String q1, String q2){
        System.out.println("StudyService.req2");
        System.out.println("q1 = " + q1 + "q2 = " + q2);
    }

    public void req3(StudyDTO studyDTO) {
        System.out.println("StudyService.req3");
        System.out.println("studyDTO = " + studyDTO);
    }

    public StudyDTO req4(){
        StudyDTO studyDTO = new StudyDTO();
        studyDTO.setQ1("나는");
        studyDTO.setQ2("이종호");
        studyDTO.setQ3(30);
        return studyDTO;
    }

    public List<StudyDTO> req5(){
        List<StudyDTO> studyDTOList = new ArrayList<>();
        for(int i=0; i<=10; i++){
            StudyDTO studyDTO = new StudyDTO();
            studyDTO.setQ1("나는" + i);
            studyDTO.setQ2("이종호다" + i);
            studyDTO.setQ3(i);
        }
        return studyDTOList;
    }





    // req2 메서드에서 q1, q2값 출력

    /*
    * req4 메서드
    * StudyDTO 객체를 리턴한다
    * index.jsp에서 req4 주소를 요청하면
    * 서비스 클래스의 req4 메서드가 리턴한 객체 데이터 값을 req4.jsp에 출력함.
     */

    /*
    * req5 메서드
    * StudyDTO가 담긴 리스트 객체를 리턴한다.
    * index.jsp에서 req5 주소를 요청하면
    * 서비스 클래스의 req5 메서드가 리턴한 객체 데이터 값을 req5.jsp에 출력함.
     */
}

