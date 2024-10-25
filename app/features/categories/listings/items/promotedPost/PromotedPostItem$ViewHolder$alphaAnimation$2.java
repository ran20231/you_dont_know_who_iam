package com.forsale.app.features.categories.listings.items.promotedPost;

import aa.ch;
import android.animation.ValueAnimator;
import androidx.cardview.widget.CardView;
import com.forsale.app.features.categories.listings.items.promotedPost.PromotedPostItem;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.o;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PromotedPostItem.kt */
/* loaded from: classes2.dex */
public final class PromotedPostItem$ViewHolder$alphaAnimation$2 extends Lambda implements g00.a<ValueAnimator> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ PromotedPostItem.ViewHolder f30859a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PromotedPostItem$ViewHolder$alphaAnimation$2(PromotedPostItem.ViewHolder viewHolder) {
        super(0);
        this.f30859a = viewHolder;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(PromotedPostItem.ViewHolder this$0, ValueAnimator it2) {
        ch chVar;
        o.i(this$0, "this$0");
        o.i(it2, "it");
        chVar = this$0.f30853a;
        CardView cardView = chVar.Q;
        Object animatedValue = it2.getAnimatedValue();
        o.g(animatedValue, "null cannot be cast to non-null type kotlin.Float");
        cardView.setAlpha(((Float) animatedValue).floatValue());
    }

    @Override // g00.a
    /* renamed from: c */
    public final ValueAnimator invoke() {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        final PromotedPostItem.ViewHolder viewHolder = this.f30859a;
        ofFloat.setDuration(1000L);
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.forsale.app.features.categories.listings.items.promotedPost.a
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                PromotedPostItem$ViewHolder$alphaAnimation$2.e(PromotedPostItem.ViewHolder.this, valueAnimator);
            }
        });
        return ofFloat;
    }
}
