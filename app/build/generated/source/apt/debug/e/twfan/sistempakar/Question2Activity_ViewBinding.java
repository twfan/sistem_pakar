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

public class Question2Activity_ViewBinding implements Unbinder {
  private Question2Activity target;

  @UiThread
  public Question2Activity_ViewBinding(Question2Activity target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public Question2Activity_ViewBinding(Question2Activity target, View source) {
    this.target = target;

    target.btn_ya_2 = Utils.findRequiredViewAsType(source, R.id.btn_ya_2, "field 'btn_ya_2'", Button.class);
    target.btn_tidak_2 = Utils.findRequiredViewAsType(source, R.id.btn_tidak_2, "field 'btn_tidak_2'", Button.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    Question2Activity target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.btn_ya_2 = null;
    target.btn_tidak_2 = null;
  }
}
