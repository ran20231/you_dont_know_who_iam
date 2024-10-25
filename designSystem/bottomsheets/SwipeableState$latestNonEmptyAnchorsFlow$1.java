package com.forsale.designSystem.bottomsheets;

import g00.a;
import java.util.Map;
import kotlin.jvm.internal.Lambda;
/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: Add missing generic type declarations: [T] */
/* compiled from: SwipeableState.kt */
/* loaded from: classes3.dex */
public final class SwipeableState$latestNonEmptyAnchorsFlow$1<T> extends Lambda implements a<Map<Float, ? extends T>> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ SwipeableState<T> f40926a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SwipeableState$latestNonEmptyAnchorsFlow$1(SwipeableState<T> swipeableState) {
        super(0);
        this.f40926a = swipeableState;
    }

    @Override // g00.a
    public final Map<Float, T> invoke() {
        return this.f40926a.l();
    }
}
