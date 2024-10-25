package com.forsale.app.utils;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: LocaleManager.kt */
@kotlin.coroutines.jvm.internal.d(c = "com.forsale.app.utils.LocaleManager", f = "LocaleManager.kt", l = {42}, m = "getCurrentLanguageAsync")
/* loaded from: classes3.dex */
public final class LocaleManager$getCurrentLanguageAsync$1 extends ContinuationImpl {

    /* renamed from: a  reason: collision with root package name */
    /* synthetic */ Object f39608a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ LocaleManager f39609b;

    /* renamed from: c  reason: collision with root package name */
    int f39610c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LocaleManager$getCurrentLanguageAsync$1(LocaleManager localeManager, zz.a<? super LocaleManager$getCurrentLanguageAsync$1> aVar) {
        super(aVar);
        this.f39609b = localeManager;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f39608a = obj;
        this.f39610c |= Integer.MIN_VALUE;
        return this.f39609b.h(this);
    }
}
