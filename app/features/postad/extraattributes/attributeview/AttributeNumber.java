package com.forsale.app.features.postad.extraattributes.attributeview;

import aa.ed;
import android.view.View;
import androidx.databinding.ObservableBoolean;
import androidx.lifecycle.s;
import androidx.lifecycle.t;
import com.forsale.app.datalayer.database.ExtraAttributeFlatGroupEntity;
import com.forsale.app.features.postad.extraattributes.attributeview.AttributeNumber;
import com.forsale.app.utils.ViewsExtensionsKt;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import g00.l;
import java.util.List;
import kotlin.jvm.internal.o;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kr.b;
import t9.r0;
import t9.t0;
import ue.f;
import wz.p;
/* compiled from: AttributeNumber.kt */
/* loaded from: classes2.dex */
public final class AttributeNumber extends pr.a<ViewHolder> {

    /* renamed from: f  reason: collision with root package name */
    private final s f35401f;

    /* renamed from: g  reason: collision with root package name */
    private final f f35402g;

    /* renamed from: h  reason: collision with root package name */
    private final int f35403h;

    /* renamed from: i  reason: collision with root package name */
    private final int f35404i;

    /* compiled from: AttributeNumber.kt */
    /* loaded from: classes2.dex */
    public static final class ViewHolder extends b.c<AttributeNumber> {

        /* renamed from: a  reason: collision with root package name */
        private final ed f35405a;

        /* renamed from: b  reason: collision with root package name */
        private final s f35406b;

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public ViewHolder(aa.ed r3, androidx.lifecycle.s r4) {
            /*
                r2 = this;
                java.lang.String r0 = "binding"
                kotlin.jvm.internal.o.i(r3, r0)
                java.lang.String r0 = "lifecycleOwner"
                kotlin.jvm.internal.o.i(r4, r0)
                android.view.View r0 = r3.getRoot()
                java.lang.String r1 = "getRoot(...)"
                kotlin.jvm.internal.o.h(r0, r1)
                r2.<init>(r0)
                r2.f35405a = r3
                r2.f35406b = r4
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.features.postad.extraattributes.attributeview.AttributeNumber.ViewHolder.<init>(aa.ed, androidx.lifecycle.s):void");
        }

        private final void j() {
            ExtraAttributeFlatGroupEntity a11;
            f h02 = this.f35405a.h0();
            boolean z11 = false;
            if (h02 != null && (a11 = h02.a()) != null && a11.isInt() == 1) {
                z11 = true;
            }
            if (z11) {
                this.f35405a.P.setInputType(2);
            } else {
                this.f35405a.P.setInputType(8194);
            }
            TextInputEditText titleEditText = this.f35405a.P;
            o.h(titleEditText, "titleEditText");
            ViewsExtensionsKt.k(titleEditText, new l<String, p>() { // from class: com.forsale.app.features.postad.extraattributes.attributeview.AttributeNumber$ViewHolder$setUpUI$1
                /* JADX INFO: Access modifiers changed from: package-private */
                {
                    super(1);
                }

                public final void b(String it2) {
                    o.i(it2, "it");
                    AttributeNumber.ViewHolder.this.l();
                }

                @Override // g00.l
                public /* bridge */ /* synthetic */ p invoke(String str) {
                    b(str);
                    return p.f75480a;
                }
            });
            BuildersKt__Builders_commonKt.launch$default(t.a(this.f35406b), null, null, new AttributeNumber$ViewHolder$setUpUI$2(this, null), 3, null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void l() {
            ExtraAttributeFlatGroupEntity extraAttributeFlatGroupEntity;
            ExtraAttributeFlatGroupEntity a11;
            boolean z11;
            ObservableBoolean e11;
            boolean j11;
            f h02 = this.f35405a.h0();
            if (h02 != null) {
                extraAttributeFlatGroupEntity = h02.a();
            } else {
                extraAttributeFlatGroupEntity = null;
            }
            if (extraAttributeFlatGroupEntity != null) {
                extraAttributeFlatGroupEntity.setTextNumValue(String.valueOf(this.f35405a.P.getText()));
            }
            f h03 = this.f35405a.h0();
            if (h03 != null && (e11 = h03.e()) != null && (j11 = e11.j())) {
                TextInputLayout textInputLayout = this.f35405a.O;
                o.h(textInputLayout, "textInputLayout");
                zi.f.t(textInputLayout, Boolean.valueOf(j11), Boolean.TRUE);
            }
            f h04 = this.f35405a.h0();
            if (h04 != null && (a11 = h04.a()) != null) {
                String textNumValue = a11.getTextNumValue();
                if (textNumValue != null && textNumValue.length() != 0) {
                    z11 = false;
                } else {
                    z11 = true;
                }
                if (!z11) {
                    TextInputLayout textInputLayout2 = this.f35405a.O;
                    o.h(textInputLayout2, "textInputLayout");
                    zi.f.q(textInputLayout2, Integer.valueOf(a11.getMin()), Integer.valueOf(a11.getMax()));
                }
            }
        }

        @Override // kr.b.c
        /* renamed from: g */
        public void b(AttributeNumber item, List<? extends Object> payloads) {
            o.i(item, "item");
            o.i(payloads, "payloads");
            this.f35405a.i0(item.x());
            this.f35405a.U(item.v());
            j();
            this.f35405a.u();
        }

        public final ed h() {
            return this.f35405a;
        }

        public final s i() {
            return this.f35406b;
        }

        @Override // kr.b.c
        /* renamed from: k */
        public void e(AttributeNumber item) {
            o.i(item, "item");
        }
    }

    public AttributeNumber(s lifecycleOwner, f viewModel) {
        o.i(lifecycleOwner, "lifecycleOwner");
        o.i(viewModel, "viewModel");
        this.f35401f = lifecycleOwner;
        this.f35402g = viewModel;
        this.f35403h = t0.S2;
        this.f35404i = r0.X4;
    }

    @Override // kr.m
    public int getType() {
        return this.f35404i;
    }

    @Override // pr.a
    public int t() {
        return this.f35403h;
    }

    public final s v() {
        return this.f35401f;
    }

    @Override // pr.a
    /* renamed from: w */
    public ViewHolder u(View v11) {
        o.i(v11, "v");
        ed f02 = ed.f0(v11);
        o.h(f02, "bind(...)");
        return new ViewHolder(f02, this.f35401f);
    }

    public final f x() {
        return this.f35402g;
    }
}
