// Generated code from Butter Knife. Do not modify!
package e.twfan.sistempakar;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.view.View;
import android.widget.Button;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import java.lang.IllegalStateException;
import java.lang.Override;

public class Question4Activity_ViewBinding implements Unbinder {
  private Question4Activity target;

  @UiThread
  public Question4Activity_ViewBinding(Question4Activity target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public Question4Activity_ViewBinding(Question4Activity target, View source) {
    this.target = target;

    target.btn_ya_4 = Utils.findRequiredViewAsType(source, R.id.btn_ya_4, "field 'btn_ya_4'", Button.class);
    target.btn_tidak_4 = Utils.findRequiredViewAsType(source, R.id.btn_tidak_4, "field 'btn_tidak_4'", Button.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    Question4Activity target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.btn_ya_4 = null;
    target.btn_tidak_4 = null;
  }
}
