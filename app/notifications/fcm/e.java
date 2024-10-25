package com.forsale.app.notifications.fcm;

import com.google.firebase.messaging.FirebaseMessagingService;
import dagger.hilt.android.internal.managers.i;
/* compiled from: Hilt_ForSaleMessagingServiceBase.java */
/* loaded from: classes2.dex */
public abstract class e extends FirebaseMessagingService implements mx.b {

    /* renamed from: a  reason: collision with root package name */
    private volatile i f37616a;

    /* renamed from: b  reason: collision with root package name */
    private final Object f37617b = new Object();

    /* renamed from: c  reason: collision with root package name */
    private boolean f37618c = false;

    @Override // mx.b
    public final Object F() {
        return c().F();
    }

    public final i c() {
        if (this.f37616a == null) {
            synchronized (this.f37617b) {
                if (this.f37616a == null) {
                    this.f37616a = d();
                }
            }
        }
        return this.f37616a;
    }

    protected i d() {
        return new i(this);
    }

    protected void e() {
        if (!this.f37618c) {
            this.f37618c = true;
            ((a) F()).b((ForSaleMessagingServiceBase) mx.d.a(this));
        }
    }

    @Override // android.app.Service
    public void onCreate() {
        e();
        super.onCreate();
    }
}
