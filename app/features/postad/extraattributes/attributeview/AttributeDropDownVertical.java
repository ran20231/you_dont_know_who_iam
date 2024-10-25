package com.forsale.app.features.postad.extraattributes.attributeview;

import aa.ad;
import android.view.View;
import androidx.databinding.ObservableBoolean;
import androidx.databinding.ObservableField;
import androidx.lifecycle.s;
import androidx.lifecycle.t;
import com.forsale.app.datalayer.database.ExtraAttributeFlatGroupEntity;
import com.forsale.app.datalayer.repositories.ApplicationResourcesRepository;
import com.forsale.app.datalayer.repositories.ExtraAttributeOptionDao;
import com.google.android.material.textfield.TextInputLayout;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.o;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kr.b;
import t9.r0;
import t9.t0;
import wz.h;
import zi.f;
/* compiled from: AttributeDropDownVertical.kt */
/* loaded from: classes2.dex */
public final class AttributeDropDownVertical extends pr.a<ViewHolder> {

    /* renamed from: f  reason: collision with root package name */
    private final s f35252f;

    /* renamed from: g  reason: collision with root package name */
    private final AttributeDropDownVerticalViewModel f35253g;

    /* renamed from: h  reason: collision with root package name */
    private final int f35254h;

    /* renamed from: i  reason: collision with root package name */
    private final int f35255i;

    /* compiled from: AttributeDropDownVertical.kt */
    /* loaded from: classes2.dex */
    public static final class ViewHolder extends b.c<AttributeDropDownVertical> {

        /* renamed from: a  reason: collision with root package name */
        private final ad f35256a;

        /* renamed from: b  reason: collision with root package name */
        private final s f35257b;

        /* renamed from: c  reason: collision with root package name */
        private final h f35258c;

        /* renamed from: d  reason: collision with root package name */
        private final h f35259d;

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public ViewHolder(aa.ad r3, androidx.lifecycle.s r4) {
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
                r2.f35256a = r3
                r2.f35257b = r4
                com.forsale.app.features.postad.extraattributes.attributeview.AttributeDropDownVertical$ViewHolder$resourceRepository$2 r3 = new com.forsale.app.features.postad.extraattributes.attributeview.AttributeDropDownVertical$ViewHolder$resourceRepository$2
                r3.<init>()
                wz.h r3 = kotlin.c.a(r3)
                r2.f35258c = r3
                com.forsale.app.features.postad.extraattributes.attributeview.AttributeDropDownVertical$ViewHolder$optionsDao$2 r3 = new com.forsale.app.features.postad.extraattributes.attributeview.AttributeDropDownVertical$ViewHolder$optionsDao$2
                r3.<init>()
                wz.h r3 = kotlin.c.a(r3)
                r2.f35259d = r3
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.features.postad.extraattributes.attributeview.AttributeDropDownVertical.ViewHolder.<init>(aa.ad, androidx.lifecycle.s):void");
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final ExtraAttributeOptionDao l() {
            return (ExtraAttributeOptionDao) this.f35259d.getValue();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final ApplicationResourcesRepository m() {
            return (ApplicationResourcesRepository) this.f35258c.getValue();
        }

        private final void n(AttributeDropDownVertical attributeDropDownVertical) {
            ExtraAttributeFlatGroupEntity d11;
            ObservableField<Integer> j11;
            ObservableField<String> i11;
            Pair<Integer, String> f11;
            ObservableField<Integer> j12;
            ObservableField<String> i12;
            BuildersKt__Builders_commonKt.launch$default(t.a(attributeDropDownVertical.w()), null, null, new AttributeDropDownVertical$ViewHolder$setUpUI$1(attributeDropDownVertical, this, null), 3, null);
            AttributeDropDownVerticalViewModel h02 = this.f35256a.h0();
            if (h02 != null && (d11 = h02.d()) != null) {
                int optionId = d11.getOptionId();
                if (optionId > 0) {
                    AttributeDropDownVerticalViewModel h03 = this.f35256a.h0();
                    if (h03 != null) {
                        h03.h(optionId);
                    }
                } else if (optionId == -1) {
                    AttributeDropDownVerticalViewModel h04 = this.f35256a.h0();
                    if (h04 != null && (f11 = h04.f()) != null) {
                        AttributeDropDownVerticalViewModel h05 = this.f35256a.h0();
                        if (h05 != null && (i12 = h05.i()) != null) {
                            i12.k(f11.d());
                        }
                        AttributeDropDownVerticalViewModel h06 = this.f35256a.h0();
                        if (h06 != null && (j12 = h06.j()) != null) {
                            j12.k(f11.c());
                        }
                    }
                } else {
                    AttributeDropDownVerticalViewModel h07 = this.f35256a.h0();
                    if (h07 != null && (i11 = h07.i()) != null) {
                        i11.k("");
                    }
                    AttributeDropDownVerticalViewModel h08 = this.f35256a.h0();
                    if (h08 != null && (j11 = h08.j()) != null) {
                        j11.k(0);
                    }
                }
            }
            BuildersKt__Builders_commonKt.launch$default(t.a(attributeDropDownVertical.w()), null, null, new AttributeDropDownVertical$ViewHolder$setUpUI$3(attributeDropDownVertical, this, null), 3, null);
            BuildersKt__Builders_commonKt.launch$default(t.a(attributeDropDownVertical.w()), null, null, new AttributeDropDownVertical$ViewHolder$setUpUI$4(attributeDropDownVertical, this, null), 3, null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void p() {
            ObservableBoolean l11;
            boolean j11;
            Integer num;
            ObservableField<Integer> j12;
            AttributeDropDownVerticalViewModel h02 = this.f35256a.h0();
            if (h02 != null && (l11 = h02.l()) != null && (j11 = l11.j())) {
                TextInputLayout textInputLayout = this.f35256a.O;
                o.h(textInputLayout, "textInputLayout");
                Boolean valueOf = Boolean.valueOf(j11);
                AttributeDropDownVerticalViewModel h03 = this.f35256a.h0();
                if (h03 != null && (j12 = h03.j()) != null) {
                    num = j12.j();
                } else {
                    num = null;
                }
                f.v(textInputLayout, valueOf, num, Boolean.TRUE);
            }
        }

        @Override // kr.b.c
        /* renamed from: i */
        public void b(AttributeDropDownVertical item, List<? extends Object> payloads) {
            o.i(item, "item");
            o.i(payloads, "payloads");
            this.f35256a.i0(item.f35253g);
            this.f35256a.U(item.w());
            n(item);
            this.f35256a.u();
        }

        public final ad j() {
            return this.f35256a;
        }

        public final s k() {
            return this.f35257b;
        }

        @Override // kr.b.c
        /* renamed from: o */
        public void e(AttributeDropDownVertical item) {
            o.i(item, "item");
        }
    }

    public AttributeDropDownVertical(s lifeCycleOwner, AttributeDropDownVerticalViewModel viewModel) {
        o.i(lifeCycleOwner, "lifeCycleOwner");
        o.i(viewModel, "viewModel");
        this.f35252f = lifeCycleOwner;
        this.f35253g = viewModel;
        this.f35254h = t0.Q2;
        this.f35255i = r0.V4;
    }

    @Override // kr.m
    public int getType() {
        return this.f35255i;
    }

    @Override // pr.a
    public int t() {
        return this.f35254h;
    }

    public final s w() {
        return this.f35252f;
    }

    @Override // pr.a
    /* renamed from: x */
    public ViewHolder u(View v11) {
        o.i(v11, "v");
        ad f02 = ad.f0(v11);
        o.h(f02, "bind(...)");
        return new ViewHolder(f02, this.f35252f);
    }
}
