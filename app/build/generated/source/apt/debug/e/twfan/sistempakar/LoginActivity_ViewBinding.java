// Generated code from Butter Knife. Do not modify!
package e.twfan.sistempakar;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.view.View;
import android.widget.EditText;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.andexert.library.RippleView;
import java.lang.IllegalStateException;
import java.lang.Override;

public class LoginActivity_ViewBinding implements Unbinder {
  private LoginActivity target;

  @UiThread
  public LoginActivity_ViewBinding(LoginActivity target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public LoginActivity_ViewBinding(LoginActivity target, View source) {
    this.target = target;

    target.ripLogin = Utils.findRequiredViewAsType(source, R.id.ripLogin, "field 'ripLogin'", RippleView.class);
    target.inputNomorOnline = Utils.findRequiredViewAsType(source, R.id.inputNomorOnline, "field 'inputNomorOnline'", EditText.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    LoginActivity target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.ripLogin = null;
    target.inputNomorOnline = null;
  }
}
