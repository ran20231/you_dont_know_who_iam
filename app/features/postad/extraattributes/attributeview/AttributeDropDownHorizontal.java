package com.forsale.app.features.postad.extraattributes.attributeview;

import aa.yc;
import android.view.View;
import android.widget.CompoundButton;
import androidx.lifecycle.s;
import androidx.lifecycle.t;
import com.forsale.app.datalayer.database.ExtraAttributeFlatGroupEntity;
import com.google.android.material.chip.Chip;
import com.google.android.material.chip.ChipGroup;
import java.util.List;
import kotlin.jvm.internal.o;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kr.b;
import t9.o0;
import t9.r0;
import t9.t0;
import ue.d;
import ue.e;
/* compiled from: AttributeDropDownHorizontal.kt */
/* loaded from: classes2.dex */
public final class AttributeDropDownHorizontal extends pr.a<ViewHolder> {

    /* renamed from: f */
    private final s f35220f;

    /* renamed from: g */
    private final AttributeDropDownHorizontalViewModel f35221g;

    /* renamed from: h */
    private final int f35222h;

    /* renamed from: i */
    private final int f35223i;

    /* compiled from: AttributeDropDownHorizontal.kt */
    /* loaded from: classes2.dex */
    public static final class ViewHolder extends b.c<AttributeDropDownHorizontal> {

        /* renamed from: a */
        private final yc f35224a;

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public ViewHolder(aa.yc r3) {
            /*
                r2 = this;
                java.lang.String r0 = "binding"
                kotlin.jvm.internal.o.i(r3, r0)
                android.view.View r0 = r3.getRoot()
                java.lang.String r1 = "getRoot(...)"
                kotlin.jvm.internal.o.h(r0, r1)
                r2.<init>(r0)
                r2.f35224a = r3
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.features.postad.extraattributes.attributeview.AttributeDropDownHorizontal.ViewHolder.<init>(aa.yc):void");
        }

        public final int k(int i11, String str) {
            Chip chip = new Chip(this.f35224a.getRoot().getContext());
            chip.setId(i11);
            chip.setCheckable(true);
            chip.setCheckedIconVisible(false);
            chip.setTextAlignment(4);
            chip.setText(str);
            chip.setTag(str);
            chip.setChipStrokeWidth(3.0f);
            chip.setChipBackgroundColor(androidx.core.content.b.getColorStateList(chip.getContext(), o0.B));
            chip.setChipStrokeColor(androidx.core.content.b.getColorStateList(chip.getContext(), o0.C));
            chip.setTextColor(androidx.core.content.b.getColorStateList(chip.getContext(), o0.D));
            chip.setChipCornerRadius(100.0f);
            chip.setOnCheckedChangeListener(new e());
            this.f35224a.O.addView(chip);
            return chip.getId();
        }

        public static final void l(CompoundButton compoundButton, boolean z11) {
            compoundButton.setClickable(!z11);
        }

        private final void n() {
            this.f35224a.O.removeAllViews();
        }

        private final void o() {
            ExtraAttributeFlatGroupEntity c11;
            AttributeDropDownHorizontalViewModel h02;
            s B = this.f35224a.B();
            if (B != null) {
                BuildersKt__Builders_commonKt.launch$default(t.a(B), null, null, new AttributeDropDownHorizontal$ViewHolder$setUpUI$1$1(B, this, null), 3, null);
                BuildersKt__Builders_commonKt.launch$default(t.a(B), null, null, new AttributeDropDownHorizontal$ViewHolder$setUpUI$1$2(B, this, null), 3, null);
            }
            AttributeDropDownHorizontalViewModel h03 = this.f35224a.h0();
            if (h03 != null && (c11 = h03.c()) != null && (h02 = this.f35224a.h0()) != null) {
                h02.e(c11.getId());
            }
            this.f35224a.O.setOnCheckedChangeListener(new d(this));
        }

        public static final void p(ViewHolder this$0, ChipGroup chipGroup, int i11) {
            o.i(this$0, "this$0");
            o.i(chipGroup, "chipGroup");
            Chip chip = (Chip) chipGroup.findViewById(chipGroup.getCheckedChipId());
            ExtraAttributeFlatGroupEntity extraAttributeFlatGroupEntity = null;
            boolean z11 = false;
            if (chip != null) {
                AttributeDropDownHorizontalViewModel h02 = this$0.f35224a.h0();
                if (h02 != null) {
                    extraAttributeFlatGroupEntity = h02.c();
                }
                if (extraAttributeFlatGroupEntity != null) {
                    extraAttributeFlatGroupEntity.setOptionId(chip.getId());
                }
                this$0.f35224a.O.g(chip.getId());
            } else {
                AttributeDropDownHorizontalViewModel h03 = this$0.f35224a.h0();
                if (h03 != null) {
                    extraAttributeFlatGroupEntity = h03.c();
                }
                if (extraAttributeFlatGroupEntity != null) {
                    extraAttributeFlatGroupEntity.setOptionId(0);
                }
                this$0.f35224a.O.g(0);
            }
            if (chip != null && chip.isPressed()) {
                z11 = true;
            }
            if (z11) {
                this$0.r();
            }
        }

        public final void r() {
            AttributeDropDownHorizontalViewModel h02 = this.f35224a.h0();
            if (h02 != null) {
                this.f35224a.S.setTextColor(h02.f());
                if (h02.h()) {
                    this.f35224a.S.setVisibility(0);
                } else {
                    this.f35224a.S.setVisibility(4);
                }
            }
        }

        @Override // kr.b.c
        /* renamed from: j */
        public void b(AttributeDropDownHorizontal item, List<? extends Object> payloads) {
            o.i(item, "item");
            o.i(payloads, "payloads");
            this.f35224a.i0(item.f35221g);
            this.f35224a.U(item.w());
            o();
            this.f35224a.u();
        }

        public final yc m() {
            return this.f35224a;
        }

        @Override // kr.b.c
        /* renamed from: q */
        public void e(AttributeDropDownHorizontal item) {
            o.i(item, "item");
            n();
            this.f35224a.O.setOnCheckedChangeListener(null);
        }
    }

    public AttributeDropDownHorizontal(s lifeCycleOwner, AttributeDropDownHorizontalViewModel viewModel) {
        o.i(lifeCycleOwner, "lifeCycleOwner");
        o.i(viewModel, "viewModel");
        this.f35220f = lifeCycleOwner;
        this.f35221g = viewModel;
        this.f35222h = t0.P2;
        this.f35223i = r0.U4;
    }

    @Override // kr.m
    public int getType() {
        return this.f35223i;
    }

    @Override // pr.a
    public int t() {
        return this.f35222h;
    }

    public final s w() {
        return this.f35220f;
    }

    @Override // pr.a
    /* renamed from: x */
    public ViewHolder u(View v11) {
        o.i(v11, "v");
        yc f02 = yc.f0(v11);
        o.h(f02, "bind(...)");
        return new ViewHolder(f02);
    }
}
