package com.github.repository.reader.reporeader.RepoReader.Model.Response;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class BranchRest {
    private String branchName;
    private String sha;
}
