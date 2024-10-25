package com.forsale.app.features.postad;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PostAdRepository.kt */
@kotlin.coroutines.jvm.internal.d(c = "com.forsale.app.features.postad.PostAdRepository", f = "PostAdRepository.kt", l = {24, 28}, m = "isImageTutorialHasBeenViewed")
/* loaded from: classes2.dex */
public final class PostAdRepository$isImageTutorialHasBeenViewed$1 extends ContinuationImpl {

    /* renamed from: a  reason: collision with root package name */
    Object f33904a;

    /* renamed from: b  reason: collision with root package name */
    int f33905b;

    /* renamed from: c  reason: collision with root package name */
    /* synthetic */ Object f33906c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ PostAdRepository f33907d;

    /* renamed from: e  reason: collision with root package name */
    int f33908e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PostAdRepository$isImageTutorialHasBeenViewed$1(PostAdRepository postAdRepository, zz.a<? super PostAdRepository$isImageTutorialHasBeenViewed$1> aVar) {
        super(aVar);
        this.f33907d = postAdRepository;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f33906c = obj;
        this.f33908e |= Integer.MIN_VALUE;
        return this.f33907d.f(0, this);
    }
}
