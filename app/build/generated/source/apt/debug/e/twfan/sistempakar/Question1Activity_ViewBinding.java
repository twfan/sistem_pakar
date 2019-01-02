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

public class Question1Activity_ViewBinding implements Unbinder {
  private Question1Activity target;

  @UiThread
  public Question1Activity_ViewBinding(Question1Activity target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public Question1Activity_ViewBinding(Question1Activity target, View source) {
    this.target = target;

    target.btn_ya_1 = Utils.findRequiredViewAsType(source, R.id.btn_ya_1, "field 'btn_ya_1'", Button.class);
    target.btn_tidak_1 = Utils.findRequiredViewAsType(source, R.id.btn_tidak_1, "field 'btn_tidak_1'", Button.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    Question1Activity target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.btn_ya_1 = null;
    target.btn_tidak_1 = null;
  }
}
