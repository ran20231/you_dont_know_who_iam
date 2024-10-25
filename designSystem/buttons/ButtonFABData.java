package com.forsale.designSystem.buttons;

import kotlin.jvm.internal.DefaultConstructorMarker;
import wz.h;
/* compiled from: ButtonFABData.kt */
/* loaded from: classes3.dex */
public abstract class ButtonFABData {

    /* renamed from: a  reason: collision with root package name */
    public static final a f41024a = new a(null);

    /* renamed from: b  reason: collision with root package name */
    public static final int f41025b = 0;

    /* renamed from: c  reason: collision with root package name */
    private static final h<c> f41026c;

    /* renamed from: d  reason: collision with root package name */
    private static final h<b> f41027d;

    /* compiled from: ButtonFABData.kt */
    /* loaded from: classes3.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final ButtonFABData a() {
            return (ButtonFABData) ButtonFABData.f41026c.getValue();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: ButtonFABData.kt */
    /* loaded from: classes3.dex */
    public static final class b extends ButtonFABData {
        public b() {
            super(null);
        }

        @Override // com.forsale.designSystem.buttons.ButtonFABData
        public float b() {
            return e2.h.l(56);
        }

        @Override // com.forsale.designSystem.buttons.ButtonFABData
        public float c() {
            return e2.h.l(16);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: ButtonFABData.kt */
    /* loaded from: classes3.dex */
    public static final class c extends ButtonFABData {
        public c() {
            super(null);
        }

        @Override // com.forsale.designSystem.buttons.ButtonFABData
        public float b() {
            return e2.h.l(40);
        }

        @Override // com.forsale.designSystem.buttons.ButtonFABData
        public float c() {
            return e2.h.l(8);
        }
    }

    static {
        h<c> a11;
        h<b> a12;
        a11 = kotlin.d.a(ButtonFABData$Companion$Small$2.f41029a);
        f41026c = a11;
        a12 = kotlin.d.a(ButtonFABData$Companion$Large$2.f41028a);
        f41027d = a12;
    }

    private ButtonFABData() {
    }

    public /* synthetic */ ButtonFABData(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public abstract float b();

    public abstract float c();
}
