package com.github.repository.reader.reporeader.Feign.Model.Response.Branch;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class BranchGithubResponse {
    private String name;
    private Commit commit;
}
