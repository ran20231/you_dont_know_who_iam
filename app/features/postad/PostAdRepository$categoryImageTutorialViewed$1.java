package com.forsale.app.features.postad;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PostAdRepository.kt */
@kotlin.coroutines.jvm.internal.d(c = "com.forsale.app.features.postad.PostAdRepository", f = "PostAdRepository.kt", l = {18, 20}, m = "categoryImageTutorialViewed")
/* loaded from: classes2.dex */
public final class PostAdRepository$categoryImageTutorialViewed$1 extends ContinuationImpl {

    /* renamed from: a  reason: collision with root package name */
    Object f33899a;

    /* renamed from: b  reason: collision with root package name */
    int f33900b;

    /* renamed from: c  reason: collision with root package name */
    /* synthetic */ Object f33901c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ PostAdRepository f33902d;

    /* renamed from: e  reason: collision with root package name */
    int f33903e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PostAdRepository$categoryImageTutorialViewed$1(PostAdRepository postAdRepository, zz.a<? super PostAdRepository$categoryImageTutorialViewed$1> aVar) {
        super(aVar);
        this.f33902d = postAdRepository;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object b11;
        this.f33901c = obj;
        this.f33903e |= Integer.MIN_VALUE;
        b11 = this.f33902d.b(0, this);
        return b11;
    }
}
