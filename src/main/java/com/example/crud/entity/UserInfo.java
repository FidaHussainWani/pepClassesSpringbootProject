@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class UserInfo {
  @Id
  long Id;
  
  String name;
  String phone;
  String profilePic;
  String location;

  @OneToOne
  User user;

}
