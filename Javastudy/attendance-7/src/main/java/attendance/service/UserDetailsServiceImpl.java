package attendance.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import attendance.entity.UserEntity;
import attendance.repository.UserRepository;

@Service
public class UserDetailsServiceImpl implements UserDetailsService {

    @Autowired
    private UserRepository userRepository;

    // loadUserByUsernameはUserDetailsのメソッド
    @Override
    public UserDetails loadUserByUsername(String loginId) throws UsernameNotFoundException {

        UserEntity loginUser = userRepository.findUser(loginId);

        if (loginUser == null) {
            throw new UsernameNotFoundException("User" + loginId + "アカウントが存在しません");
        }
//       権限の設定（ダミー）
//      List<GrantedAuthority> grantList = new ArrayList<GrantedAuthority>();
//      GrantedAuthority authority = new SimpleGrantedAuthority("USER");
//      grantList.add(authority);

//      UserDetailsはインタフェースなのでUserクラスのコンストラクタで生成したユーザオブジェクトをキャスト
//      UserDetails userDetails = (UserDetails) new User(loginUser.getLoginId(), loginUser.getPassword(), grantList);

        return loginUser;
    }
}
