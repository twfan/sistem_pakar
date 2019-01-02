// Generated code from Butter Knife. Do not modify!
package e.twfan.sistempakar;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.view.View;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.andexert.library.RippleView;
import java.lang.IllegalStateException;
import java.lang.Override;

public class ResultActivity_ViewBinding implements Unbinder {
  private ResultActivity target;

  @UiThread
  public ResultActivity_ViewBinding(ResultActivity target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public ResultActivity_ViewBinding(ResultActivity target, View source) {
    this.target = target;

    target.txt_solusi = Utils.findRequiredViewAsType(source, R.id.txt_solusi, "field 'txt_solusi'", TextView.class);
    target.txt_no_online = Utils.findRequiredViewAsType(source, R.id.txt_no_online, "field 'txt_no_online'", TextView.class);
    target.txt_bentuk_usaha = Utils.findRequiredViewAsType(source, R.id.txt_bentuk_usaha, "field 'txt_bentuk_usaha'", TextView.class);
    target.txt_jenis_izin = Utils.findRequiredViewAsType(source, R.id.txt_jenis_izin, "field 'txt_jenis_izin'", TextView.class);
    target.txt_nama_perusahaan = Utils.findRequiredViewAsType(source, R.id.txt_nama_perusahaan, "field 'txt_nama_perusahaan'", TextView.class);
    target.txt_posisi_berkas = Utils.findRequiredViewAsType(source, R.id.txt_posisi_berkas, "field 'txt_posisi_berkas'", TextView.class);
    target.txt_status_berkas = Utils.findRequiredViewAsType(source, R.id.txt_status_berkas, "field 'txt_status_berkas'", TextView.class);
    target.ripSelesai = Utils.findRequiredViewAsType(source, R.id.ripSelesai, "field 'ripSelesai'", RippleView.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    ResultActivity target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.txt_solusi = null;
    target.txt_no_online = null;
    target.txt_bentuk_usaha = null;
    target.txt_jenis_izin = null;
    target.txt_nama_perusahaan = null;
    target.txt_posisi_berkas = null;
    target.txt_status_berkas = null;
    target.ripSelesai = null;
  }
}
