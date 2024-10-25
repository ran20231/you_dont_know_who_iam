package com.forsale.app.utils;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: LocaleManager.kt */
@kotlin.coroutines.jvm.internal.d(c = "com.forsale.app.utils.LocaleManager", f = "LocaleManager.kt", l = {67}, m = "setCurrentLanguageDistinct")
/* loaded from: classes3.dex */
public final class LocaleManager$setCurrentLanguageDistinct$1 extends ContinuationImpl {

    /* renamed from: a  reason: collision with root package name */
    Object f39613a;

    /* renamed from: b  reason: collision with root package name */
    /* synthetic */ Object f39614b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ LocaleManager f39615c;

    /* renamed from: d  reason: collision with root package name */
    int f39616d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LocaleManager$setCurrentLanguageDistinct$1(LocaleManager localeManager, zz.a<? super LocaleManager$setCurrentLanguageDistinct$1> aVar) {
        super(aVar);
        this.f39615c = localeManager;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f39614b = obj;
        this.f39616d |= Integer.MIN_VALUE;
        return this.f39615c.w(null, this);
    }
}
