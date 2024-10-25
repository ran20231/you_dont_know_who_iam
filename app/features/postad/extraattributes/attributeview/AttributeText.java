package com.forsale.app.features.postad.extraattributes.attributeview;

import aa.gd;
import android.view.View;
import androidx.databinding.ObservableBoolean;
import androidx.lifecycle.s;
import androidx.lifecycle.t;
import com.forsale.app.datalayer.database.ExtraAttributeFlatGroupEntity;
import com.forsale.app.features.postad.PostAdViewModel;
import com.forsale.app.features.postad.extraattributes.attributeview.AttributeText;
import com.forsale.app.utils.ViewsExtensionsKt;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import g00.l;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.o;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kr.b;
import t9.r0;
import t9.t0;
import t9.y0;
import ue.h;
import wz.p;
import zi.f;
/* compiled from: AttributeText.kt */
/* loaded from: classes2.dex */
public final class AttributeText extends pr.a<ViewHolder> {

    /* renamed from: f  reason: collision with root package name */
    private final s f35414f;

    /* renamed from: g  reason: collision with root package name */
    private final h f35415g;

    /* renamed from: h  reason: collision with root package name */
    private final int f35416h;

    /* renamed from: i  reason: collision with root package name */
    private final int f35417i;

    /* compiled from: AttributeText.kt */
    /* loaded from: classes2.dex */
    public static final class ViewHolder extends b.c<AttributeText> {

        /* renamed from: a  reason: collision with root package name */
        private final gd f35418a;

        /* renamed from: b  reason: collision with root package name */
        private final s f35419b;

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public ViewHolder(aa.gd r3, androidx.lifecycle.s r4) {
            /*
                r2 = this;
                java.lang.String r0 = "binding"
                kotlin.jvm.internal.o.i(r3, r0)
                java.lang.String r0 = "lifeCycleOwner"
                kotlin.jvm.internal.o.i(r4, r0)
                android.view.View r0 = r3.getRoot()
                java.lang.String r1 = "getRoot(...)"
                kotlin.jvm.internal.o.h(r0, r1)
                r2.<init>(r0)
                r2.f35418a = r3
                r2.f35419b = r4
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.features.postad.extraattributes.attributeview.AttributeText.ViewHolder.<init>(aa.gd, androidx.lifecycle.s):void");
        }

        private final void j() {
            TextInputEditText titleEditText = this.f35418a.P;
            o.h(titleEditText, "titleEditText");
            ViewsExtensionsKt.k(titleEditText, new l<String, p>() { // from class: com.forsale.app.features.postad.extraattributes.attributeview.AttributeText$ViewHolder$setUpUI$1
                /* JADX INFO: Access modifiers changed from: package-private */
                {
                    super(1);
                }

                public final void b(String it2) {
                    o.i(it2, "it");
                    AttributeText.ViewHolder.this.l();
                }

                @Override // g00.l
                public /* bridge */ /* synthetic */ p invoke(String str) {
                    b(str);
                    return p.f75480a;
                }
            });
            BuildersKt__Builders_commonKt.launch$default(t.a(this.f35419b), null, null, new AttributeText$ViewHolder$setUpUI$2(this, null), 3, null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void l() {
            ExtraAttributeFlatGroupEntity extraAttributeFlatGroupEntity;
            ObservableBoolean d11;
            boolean j11;
            PostAdViewModel b11;
            boolean z11;
            String t02;
            ExtraAttributeFlatGroupEntity a11;
            ArrayList<String> prohibtedKeywords;
            h h02 = this.f35418a.h0();
            if (h02 != null) {
                extraAttributeFlatGroupEntity = h02.a();
            } else {
                extraAttributeFlatGroupEntity = null;
            }
            if (extraAttributeFlatGroupEntity != null) {
                extraAttributeFlatGroupEntity.setTextNumValue(String.valueOf(this.f35418a.P.getText()));
            }
            h h03 = this.f35418a.h0();
            if (h03 != null && (b11 = h03.b()) != null) {
                List<String> Z3 = b11.Z3(String.valueOf(this.f35418a.P.getText()));
                h h04 = this.f35418a.h0();
                if (h04 != null && (a11 = h04.a()) != null && (prohibtedKeywords = a11.getProhibtedKeywords()) != null) {
                    prohibtedKeywords.clear();
                    prohibtedKeywords.addAll(Z3);
                }
                List<String> list = Z3;
                if (list != null && !list.isEmpty()) {
                    z11 = false;
                } else {
                    z11 = true;
                }
                if (z11) {
                    this.f35418a.O.setError(null);
                    this.f35418a.O.setErrorEnabled(false);
                } else {
                    this.f35418a.O.setErrorEnabled(true);
                    gd gdVar = this.f35418a;
                    TextInputLayout textInputLayout = gdVar.O;
                    String string = gdVar.getRoot().getResources().getString(y0.f70416d5);
                    o.h(string, "getString(...)");
                    t02 = CollectionsKt___CollectionsKt.t0(Z3, " , ", null, null, 0, null, null, 62, null);
                    String format = String.format(string, Arrays.copyOf(new Object[]{t02}, 1));
                    o.h(format, "format(...)");
                    textInputLayout.setError(format);
                    return;
                }
            }
            h h05 = this.f35418a.h0();
            if (h05 != null && (d11 = h05.d()) != null && (j11 = d11.j())) {
                TextInputLayout textInputLayout2 = this.f35418a.O;
                o.h(textInputLayout2, "textInputLayout");
                f.t(textInputLayout2, Boolean.valueOf(j11), Boolean.TRUE);
            }
        }

        @Override // kr.b.c
        /* renamed from: g */
        public void b(AttributeText item, List<? extends Object> payloads) {
            o.i(item, "item");
            o.i(payloads, "payloads");
            this.f35418a.i0(item.w());
            this.f35418a.U(this.f35419b);
            j();
            this.f35418a.u();
        }

        public final gd h() {
            return this.f35418a;
        }

        public final s i() {
            return this.f35419b;
        }

        @Override // kr.b.c
        /* renamed from: k */
        public void e(AttributeText item) {
            o.i(item, "item");
        }
    }

    public AttributeText(s lifeCycleOwner, h viewModel) {
        o.i(lifeCycleOwner, "lifeCycleOwner");
        o.i(viewModel, "viewModel");
        this.f35414f = lifeCycleOwner;
        this.f35415g = viewModel;
        this.f35416h = t0.U2;
        this.f35417i = r0.Y4;
    }

    @Override // kr.m
    public int getType() {
        return this.f35417i;
    }

    @Override // pr.a
    public int t() {
        return this.f35416h;
    }

    @Override // pr.a
    /* renamed from: v */
    public ViewHolder u(View v11) {
        o.i(v11, "v");
        gd f02 = gd.f0(v11);
        o.h(f02, "bind(...)");
        return new ViewHolder(f02, this.f35414f);
    }

    public final h w() {
        return this.f35415g;
    }
}
