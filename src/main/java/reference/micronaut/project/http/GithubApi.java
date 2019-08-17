package reference.micronaut.project.http;

import io.eldermael.zwitch.Feature;
import io.micronaut.http.HttpResponse;
import io.micronaut.http.annotation.Head;
import io.micronaut.http.annotation.Header;
import io.micronaut.http.client.annotation.Client;

@Feature("github")
@Client("https://api.github.com")
@Header(name = "User-Agent", value = "google-chrome")
public interface GithubApi {

  @Head("/orgs/{orgName}/repos?per_page=100")
  HttpResponse<Void> getHeadersOfReposFromOrg(String orgName);

  @Head("/repos/{orgName}/{repositoryName}/pulls?per_page=100")
  HttpResponse<Void> getHeadersOfPullRequestsForRepo(String orgName, String repositoryName);

}
